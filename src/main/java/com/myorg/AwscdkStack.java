package com.myorg;

import software.amazon.awscdk.services.s3.Bucket;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class AwscdkStack extends Stack {
    public AwscdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwscdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // Create an S3 Bucket
        Bucket myBucket = Bucket.Builder.create(this, "MyCdkBucket")
                .bucketName("my-pk-raju-cdk-bucket-example")
                .versioned(false)
                .build();
    }
}
