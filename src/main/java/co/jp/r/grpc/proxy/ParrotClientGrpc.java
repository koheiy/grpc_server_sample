package co.jp.r.grpc.proxy;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: parrot.proto")
public final class ParrotClientGrpc {

  private ParrotClientGrpc() {}

  public static final String SERVICE_NAME = "parrot.proxy.ParrotClient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<co.jp.r.grpc.proxy.ParrotPurchaseRequest,
      co.jp.r.grpc.proxy.ParrotPurchaseResponse> getPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Purchase",
      requestType = co.jp.r.grpc.proxy.ParrotPurchaseRequest.class,
      responseType = co.jp.r.grpc.proxy.ParrotPurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<co.jp.r.grpc.proxy.ParrotPurchaseRequest,
      co.jp.r.grpc.proxy.ParrotPurchaseResponse> getPurchaseMethod() {
    io.grpc.MethodDescriptor<co.jp.r.grpc.proxy.ParrotPurchaseRequest, co.jp.r.grpc.proxy.ParrotPurchaseResponse> getPurchaseMethod;
    if ((getPurchaseMethod = ParrotClientGrpc.getPurchaseMethod) == null) {
      synchronized (ParrotClientGrpc.class) {
        if ((getPurchaseMethod = ParrotClientGrpc.getPurchaseMethod) == null) {
          ParrotClientGrpc.getPurchaseMethod = getPurchaseMethod = 
              io.grpc.MethodDescriptor.<co.jp.r.grpc.proxy.ParrotPurchaseRequest, co.jp.r.grpc.proxy.ParrotPurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parrot.proxy.ParrotClient", "Purchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.jp.r.grpc.proxy.ParrotPurchaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.jp.r.grpc.proxy.ParrotPurchaseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParrotClientMethodDescriptorSupplier("Purchase"))
                  .build();
          }
        }
     }
     return getPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<co.jp.r.grpc.proxy.ParrotPurchaseRequest,
      co.jp.r.grpc.proxy.ParrotPurchaseResponse> getPurchaseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurchaseStream",
      requestType = co.jp.r.grpc.proxy.ParrotPurchaseRequest.class,
      responseType = co.jp.r.grpc.proxy.ParrotPurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<co.jp.r.grpc.proxy.ParrotPurchaseRequest,
      co.jp.r.grpc.proxy.ParrotPurchaseResponse> getPurchaseStreamMethod() {
    io.grpc.MethodDescriptor<co.jp.r.grpc.proxy.ParrotPurchaseRequest, co.jp.r.grpc.proxy.ParrotPurchaseResponse> getPurchaseStreamMethod;
    if ((getPurchaseStreamMethod = ParrotClientGrpc.getPurchaseStreamMethod) == null) {
      synchronized (ParrotClientGrpc.class) {
        if ((getPurchaseStreamMethod = ParrotClientGrpc.getPurchaseStreamMethod) == null) {
          ParrotClientGrpc.getPurchaseStreamMethod = getPurchaseStreamMethod = 
              io.grpc.MethodDescriptor.<co.jp.r.grpc.proxy.ParrotPurchaseRequest, co.jp.r.grpc.proxy.ParrotPurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "parrot.proxy.ParrotClient", "PurchaseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.jp.r.grpc.proxy.ParrotPurchaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.jp.r.grpc.proxy.ParrotPurchaseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParrotClientMethodDescriptorSupplier("PurchaseStream"))
                  .build();
          }
        }
     }
     return getPurchaseStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParrotClientStub newStub(io.grpc.Channel channel) {
    return new ParrotClientStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParrotClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParrotClientBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParrotClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParrotClientFutureStub(channel);
  }

  /**
   */
  public static abstract class ParrotClientImplBase implements io.grpc.BindableService {

    /**
     */
    public void purchase(co.jp.r.grpc.proxy.ParrotPurchaseRequest request,
        io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPurchaseMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseRequest> purchaseStream(
        io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPurchaseStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPurchaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                co.jp.r.grpc.proxy.ParrotPurchaseRequest,
                co.jp.r.grpc.proxy.ParrotPurchaseResponse>(
                  this, METHODID_PURCHASE)))
          .addMethod(
            getPurchaseStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                co.jp.r.grpc.proxy.ParrotPurchaseRequest,
                co.jp.r.grpc.proxy.ParrotPurchaseResponse>(
                  this, METHODID_PURCHASE_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class ParrotClientStub extends io.grpc.stub.AbstractStub<ParrotClientStub> {
    private ParrotClientStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParrotClientStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParrotClientStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParrotClientStub(channel, callOptions);
    }

    /**
     */
    public void purchase(co.jp.r.grpc.proxy.ParrotPurchaseRequest request,
        io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseRequest> purchaseStream(
        io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPurchaseStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ParrotClientBlockingStub extends io.grpc.stub.AbstractStub<ParrotClientBlockingStub> {
    private ParrotClientBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParrotClientBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParrotClientBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParrotClientBlockingStub(channel, callOptions);
    }

    /**
     */
    public co.jp.r.grpc.proxy.ParrotPurchaseResponse purchase(co.jp.r.grpc.proxy.ParrotPurchaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getPurchaseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParrotClientFutureStub extends io.grpc.stub.AbstractStub<ParrotClientFutureStub> {
    private ParrotClientFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParrotClientFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParrotClientFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParrotClientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<co.jp.r.grpc.proxy.ParrotPurchaseResponse> purchase(
        co.jp.r.grpc.proxy.ParrotPurchaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PURCHASE = 0;
  private static final int METHODID_PURCHASE_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParrotClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParrotClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PURCHASE:
          serviceImpl.purchase((co.jp.r.grpc.proxy.ParrotPurchaseRequest) request,
              (io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PURCHASE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.purchaseStream(
              (io.grpc.stub.StreamObserver<co.jp.r.grpc.proxy.ParrotPurchaseResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ParrotClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParrotClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return co.jp.r.grpc.proxy.Parrot.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParrotClient");
    }
  }

  private static final class ParrotClientFileDescriptorSupplier
      extends ParrotClientBaseDescriptorSupplier {
    ParrotClientFileDescriptorSupplier() {}
  }

  private static final class ParrotClientMethodDescriptorSupplier
      extends ParrotClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParrotClientMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ParrotClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParrotClientFileDescriptorSupplier())
              .addMethod(getPurchaseMethod())
              .addMethod(getPurchaseStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
