### Formas de executar a aplicação spring 

Executando via CLI o .JAR
```cmd
mvn spring-boot:run
```

Executa o arquivo gerado .JAR
```cmd
mvn clean install 
```

Esta pasta é padrão do MAVEN a onde fica configurado as dependencias dele.
```cmd
.m2/repository
```

Executando os arquivos .jar da aplicação.

Exemplo:

```cmd
java -jar target/spring-boot-project-fundamentals-0.0.1-SNAPSHOT.jar
```

Anotations são os @anotation

Exemplos:
\
@SpringBootApplication


### O que é uma SERVELET?
Servelet é a base do java para qualquer aplicação web que deseja-se criar.

### API REST
![alt text](image.png)

### Recursos (URLs) 

### HTTP Methods
    GET - Buscar uma informação
    POST - Inserir uma informação
    PUT - Atualizar uma informação
    DELETE - Remover uma informação

### Body (Parametro de corpo)
    {
        "username":"Celson Fernando"
    }

### Path Params
O path params faz parte da requisição.

#### Exemplo:
    https://app.bookstore.com.br/api/v2/cellphone
    https://app.bookstore.com.br/api/v2/games

### Query Params
 É adicionada a URL usando o caracter = **?**

##### Exemplo:
    https://app.bookstore.com.br/api/v2/cellphone?samsung=S24&=512

### Header Params
- Authorization
- Page

### Inversão de controle (IoC)
    O Spring é responsável por fazer essa inversão de controle através de componentes internos usando um container IoC.

    Hoje em dia não é necessário realizar essa inversão manualmente por meio de código. 

    

### Injeção de Dependencia

    No Spring esse gerenciamento é feito via notação @Autowired , e abaixo existe algum componente , ele passa a ser gerenciado pelo Spring.

    Sendo necessário adicionar a notação na classe do componente que deseja que seja gerenciado utilizando a notação @Service ou @Component.

#### Exemplo : 
```java
@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponent meuComponent;
    
    @GetMapping("/")
    public String chamandoComponent() {
        var resultado = meuComponent.chamarMeuComponent() ;
        return resultado;
    }
}

@Service 
public class MeuComponent {
    public String chamarMeuComponent() {
        return "Chamando meu component"; 
    }
}
```