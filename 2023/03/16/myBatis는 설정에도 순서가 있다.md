해결
configuration의 요소 정의 순서가 아래와 같아야 된다는 오류. 이런 거도 맞춰야 하는구나..

<configuration>

properties
settings
typeAliases
typeHandlers
objectFactory
objectWrapperFactory
reflectorFactory
plugins
environments
databaseIdProvider
mappers

</configuration>