Product: WSO2 IS authenticator for Office365
Pre-requisites:

- Maven 3.x
- Java 1.6 or above

Tested Platform:

- UBUNTU 14.04
- WSO2 IS

Do the following:

1. Execute mvn clean install to build the project.

2.Place target/org.verifone.custom.extension.identity.authenticator.office365.connector-1.0.2.jar into <IS_HOME>/repository/components/dropins. In <IS_HOME>/repository/components/dropins Remove if you already have any org.wso2.carbon.extension.identity.authenticator.office365.*.jar files if you already have.

3.Start the IS server and create Identity provider and service provider in IS via the IS console.
