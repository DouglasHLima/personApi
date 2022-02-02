<h2>Sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Desenvolvendo um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

Tecnologias e dependências utilizadas:

* Project lombok
* SpringBoot
* SprindData
* H2 database - in memory database
* MapStruct
* Java 11
* Maven

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```

link do [Heroku](https://doughlima-peopleapi.herokuapp.com/api/v1/people):
```
https://doughlima-peopleapi.herokuapp.com/api/v1/people
```

###[*Utilize o POSTMAN para testar*](https://www.postman.com/)

método POST 

*(obs: campo CPF necessita de um CPF válido)*

```json lines
{
  "firstName": "Douglas",
  "lastName":"Lima",
  "cpf":"986.527.657-74",
  "birthDate":"11-12-1995",
  "phones":[
    {
      "type":"MOBILE",
      "number":"(16)99658-8898"
    }
  ]
}
```
método GET:
```
https://doughlima-peopleapi.herokuapp.com/api/v1/people

retorno:

{
  "id": 1,
  "firstName": "Douglas",
  "lastName":"Lima",
  "cpf":"986.527.657-74",
  "birthDate":"11-12-1995",
  "phones":[
    {
      "id": 1,
      "type":"MOBILE",
      "number":"(16)99658-8898"
    }
  ]
}
```
método GET by id:
```
https://doughlima-peopleapi.herokuapp.com/api/v1/people/{id}
example:
https://doughlima-peopleapi.herokuapp.com/api/v1/people/1
```

método UPDATE by ID:

```json lines
// https://doughlima-peopleapi.herokuapp.com/api/v1/people/1
{
"id":1,
"firstName": "Doug",
"lastName":"Lima",
"cpf":"986.527.657-74",
"birthDate":"11-12-1995",
"phones":[
        {
            "id":1,
            "type":"MOBILE",
            "number":"(16)99658-8899"
        }
    ]
}
```

método DELETE by ID
```
https://doughlima-peopleapi.herokuapp.com/api/v1/people/{id}
example:
https://doughlima-peopleapi.herokuapp.com/api/v1/people/1
```


##LINKS ÚTEIS
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

##[Meu linkedin](https://www.linkedin.com/in/douglas-lima-b980441a8/)



