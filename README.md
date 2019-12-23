# Spring boot Kubernetes Configmap

This project demonstrate how to dynamically reload properties changes in microservices running in kubernetes.
[More](https://cloud.spring.io/spring-cloud-static/spring-cloud-kubernetes/1.1.0.RC2/reference/html/#why-do-you-need-spring-cloud-kubernetes)

#### prerequisite : 
 
1. Docker 
2. Kubernetes
3. Skaffold
4. Maven 
5. Minikube
6. Kubectl

#### *Steps*:

1. To install required dependency : ``mvn clean install``
2. To build images inside kubernetes Run : ``eval $(minikube docker-env)``
3. Then Build an Image : ``docker build -t spring-kubernetes-configmap .``
4. To run services : ``skaffold run``

#### *NOTE*:  
 * To run minikube : ``minikube start`` 
 * To access minikube Dashboard : ``minikube dashboard``
 * You can skip skaffold if you want and try ``kubectl create -f configmap.yaml`` | `` kubectl create deployment.yaml``
 * You mush have to create a Service accounts for more you can visit [link](https://cloud.spring.io/spring-cloud-static/spring-cloud-kubernetes/1.1.0.RC2/reference/html/#service-account)
 
   

 

 