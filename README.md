#Maven 仓库添加
```
<dependency>
	<groupId>com.simbest</groupId>
	<artifactId>simbest-api</artifactId>
	<version>0.5</version>
</dependency>
		
		
<repositories>
	<repository>
		<id>simbest-api-mvn-repo</id>
		<url>https://raw.github.com/simbest/simbest-api/mvn-repo/</url>
		<snapshots>
			<enabled>true</enabled>
			<updatePolicy>always</updatePolicy>
		</snapshots>
	</repository>
</repositories>	
```