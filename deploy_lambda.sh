ZIP_ARCHIVE="$(pwd)/target/logdemo-1.0.0.jar"
aws --region us-east-1 lambda update-function-code \
    --function-name log_demo \
    --zip-file fileb://${ZIP_ARCHIVE}
