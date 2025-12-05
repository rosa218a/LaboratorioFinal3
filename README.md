# Proyecto ejemplo: Spring Boot + Trunk-Based + Rolling Update

Este repositorio contiene un ejemplo listo para tu trabajo final:
- Aplicación Spring Boot con endpoint /hello
- Dockerfile para empaquetar la app
- Manifiestos de Kubernetes con RollingUpdate
- GitHub Actions CI/CD para build, push y deploy

## Instrucciones rápidas

1. Compilar localmente:
   - mvn package
   - java -jar target/demo-0.0.1-SNAPSHOT.jar
   - Abrir http://localhost:8080/hello

2. Docker:
   - docker build -t tuusuario/spring-demo:1.0.0 .
   - docker push tuusuario/spring-demo:1.0.0

3. Kubernetes:
   - kubectl apply -f deployment.yaml
   - kubectl apply -f service.yaml

## Notas
- Ajusta IMAGE_NAME en los secrets de GitHub.
- Reemplaza el placeholder de mvnw si quieres usar el wrapper real.
