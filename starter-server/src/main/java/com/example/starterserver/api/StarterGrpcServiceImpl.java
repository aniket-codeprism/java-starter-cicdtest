package com.example.starterserver.api;

import io.grpc.stub.StreamObserver;
import org.heartfulness.unifiedplatform.Starter.Empty;
import org.heartfulness.unifiedplatform.Starter.StarterServiceGrpc;
import org.heartfulness.unifiedplatform.Starter.TestResponse;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class StarterGrpcServiceImpl extends StarterServiceGrpc.StarterServiceImplBase {
    @Override
    public void bloomRpcTest(Empty request, StreamObserver<TestResponse> responseObserver) {
        responseObserver.onNext(TestResponse.newBuilder()
                        .setResult("BloomRpcTest :: Starter service is running successfully...")
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void postManGetMethodTest(Empty request, StreamObserver<TestResponse> responseObserver) {
        responseObserver.onNext(TestResponse.newBuilder()
                .setResult("PostManGetMethodTest :: Starter service is running successfully...")
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void espSkipTest(Empty request, StreamObserver<TestResponse> responseObserver) {
        responseObserver.onNext(TestResponse.newBuilder()
                .setResult("EspSkipTest :: Starter service is running successfully...")
                .build());
        responseObserver.onCompleted();
    }
}
