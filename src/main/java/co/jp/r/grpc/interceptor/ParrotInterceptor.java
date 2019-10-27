package co.jp.r.grpc.interceptor;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import org.lognet.springboot.grpc.GRpcGlobalInterceptor;

//@GRpcGlobalInterceptor
public class ParrotInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> serverCall, Metadata header, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        System.out.println("parrot");
        return serverCallHandler.startCall(serverCall, header);
    }
}
