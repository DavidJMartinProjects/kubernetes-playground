# kubernetes-playground

## Keycloak
helm install keycloak keycloak   
portforward port 8080  
http://localhost:8080/auth/  
  
helm delete keycloak  

helm repo add codecentric https://codecentric.github.io/helm-charts
helm install my-keycloak codecentric/keycloak --version 18.2.1  

## References
https://hamdi-bouallegue.medium.com/secure-your-angular-spring-boot-application-using-keycloak-891efab50db8


