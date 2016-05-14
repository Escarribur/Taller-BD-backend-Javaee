# Taller-BD-backend-Javaee
##Configurar Glassfish
  + jdbc/mydb_pool (misma configuracion sakila, cambiar url de base datos por mybd)
  + jdbc/mydb

##Compilar
  + gradle war

##Montar
  + asadmin start-domain
  + asadmin deploy --force (direccion del war)
