# Digital Banking (Spring/Angular)
Introduction :

Dans ce projet on va traiter le cas d’utilisation de cas digital baking ,cote backnend avec le framwork spring, cote front end : framework angular, base de donne : MariaDB.
application Web basée sur Spring et Angular qui permet de gérer des comptes bancaires. Chaque compte appartient à un client il existe deux types de comptes : Courant et Epargnes. chaque Compte peut subir des opérations de types Débit ou crédit. L'application se compose des couches suivantes :
•	Couche DAO (Entités JPA et Repositories)
•	Couche Service définissant les opérations suivantes :
o	Ajouter des comptes
o	Ajouter des client
o	Effectuer un débit (Retrait)
o	Effectuer un crédit (Versement)
o	Effectuer un virement
o	Consulter un compte
•	La couche DTO
•	Mappers (DTO <=>Entities)
•	La couche Web (Rest Controllers)

Analyse et Conception :
1.	Digramme de classe :

![image](https://user-images.githubusercontent.com/90484039/175660644-09680cd8-30f9-4b73-b892-1c8d76fe0d6a.png)


2.	Pourquoi spring et angular ?
Spring Boot et Angular sont deux frameworks particulièrement prisés pour le développement d'applications web responsives. Ils offrent un cadre structurant pour un développement productif, maintenable, testable et facilement déployable.
Gestion de code source avec Git :
![image](https://user-images.githubusercontent.com/90484039/175660675-87eac978-e2ad-4982-8eb3-2b8dc71b74e0.png)


3.	Screen : 
    ![170832446-2cbcf29f-2a89-49c3-9a74-d833994e404e](https://user-images.githubusercontent.com/90484039/175660387-d09bbdc5-a1f8-442b-9ff6-4215093783d2.png)
![170832458-cbe3a83f-bdf5-4d77-8710-59a7488fb57a](https://user-images.githubusercontent.com/90484039/175660390-d02bd871-e970-4469-9f2b-a1ac8bc17a9b.png)
![170832434-5adcc43a-a615-4f6c-baae-2cdc848c43f2](https://user-images.githubusercontent.com/90484039/175660391-fda9bb14-aee9-4ab4-9bee-10487cfe0d1b.png)
![170832441-e50374b8-2bb0-401d-847d-3a7fafe2aa65](https://user-images.githubusercontent.com/90484039/175660394-ca2e98ed-ee4f-46f7-ae5f-e7a8d2e1eee2.png)


