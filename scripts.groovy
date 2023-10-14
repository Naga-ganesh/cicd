def build() {

    echo "Building docker container"
    echo "tagging docker image"
    echo "Current branch name is the ${BRANCH_NAME}" 
    echo "build name: ${BUILD_NAME}"
    echo "${GIT_KEY}"
    echo "Feature name ${params.FEATURE_NAME} with the version of ${params.version}"
    echo "${TEST_PASS}"
}

return this