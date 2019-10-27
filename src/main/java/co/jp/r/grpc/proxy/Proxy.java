package co.jp.r.grpc.proxy;

import co.jp.r.grpc.interceptor.ParrotInterceptor;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

@GRpcService(interceptors = {ParrotInterceptor.class})
public class Proxy extends ParrotClientGrpc.ParrotClientImplBase {

    @Override
    public void purchase(final ParrotPurchaseRequest request,
                         final StreamObserver<ParrotPurchaseResponse> responseObserver) {

        System.out.println("TransactionID: " + request.getTransactionId());
        System.out.println("RequestDate: " + request.getRequestDate());
        System.out.println("Amount: " + request.getAmount());

        ParrotPurchaseResponse purchaseResponse =
                ParrotPurchaseResponse.newBuilder().setResponseCode("00").setTransactionId(request.getTransactionId()).build();
        responseObserver.onNext(purchaseResponse);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ParrotPurchaseRequest> purchaseStream(
            final StreamObserver<ParrotPurchaseResponse> responseObserver) {

        return new StreamObserver<ParrotPurchaseRequest>() {

            @Override
            public void onNext(ParrotPurchaseRequest request) {
                ParrotPurchaseResponse purchaseResponse =
                        ParrotPurchaseResponse.newBuilder().setResponseCode("00").setTransactionId(request.getTransactionId()).build();

                responseObserver.onNext(purchaseResponse);
                responseObserver.onNext(purchaseResponse);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
                responseObserver.onCompleted();
            }
        };
    }
}
