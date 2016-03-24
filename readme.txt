mvn clean install -o -Dmaven.test.skip=true

mvn deploy -U -Dmaven.test.skip=true （确保hosted类型的仓库的Deployment Policy选择为Allow Redeploy）

http://10.87.14.77:8081/nexus/content/repositories/public/com/simbest/simbest-api/0.1/


http://localhost:8080/onegym/action/api/admin/authority/sysuser/getById
{"systemContent":{"accesstoken":"a7810924efe0ea1ce279d130eb43fadc","timestamp":"1448421767432","md5":"a7b093a27df793e2334dbfa5f2e36f57"},"dataContent":"{\"id\":\"7876\"}"}