# Postman & Newman Demo
The intention of this repo is to store stuff for a demo of Postman and Newman. Slides for the demo can be found in `/slides`

## Example Applications
For the purpose of the demo two services have been created `inventory` and `shopping`. These are two similar spring boot apps and can be found in `/inventory-svc` and `/shopping-svc` respectivly 

### Starting the services
The simplest way to start the services is to use the `docker-compose.yml` file provided:

```bash
docker-compose up -d --build
```

This will start services on the following ports:

- inventory: 8080
- shopping: 8090

### Interacting with the services
Both Services provide a detailed api specification in `api-spec.yaml` in each of their respective directories

