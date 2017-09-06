package ro.microservices.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthApplication {

    //In order to generate the key!!
    //keytool -genkeypair -alias jwt -keyalg RSA -dname "CN=microservice, L=Bucuresti, c=RO" -keypass mySecretKey -keystore jwd.jks -storepass mySecretKey

    public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

    /**
     *      Token example:
     *  {
     *      "access_token" : "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MDQ3NDA5NzAsInVzZXJfbmFtZSI6InJlYWRlciIsImF1dGhvcml0aWVzIjpbIlJFQUQiXSwianRpIjoiOGM3Y2M4ZTctYTFkYi00MGMyLTk0M2ItMmNlMWFjOGE0MTVlIiwiY2xpZW50X2lkIjoid2ViX2FwcCIsInNjb3BlIjpbImRlbW8iXX0.Svl0-JTofUWZ7VRZguBzHSU3DMy4clfFBTp0S-nNrFnFENlMKM638ZYh4O4YEuz-GTLPc17N-sce3F8HSQnOaqDe8KEec9LBv21KMvHRO6xn3EKS3n7WunRD__dvdQdYaIQ0fblfELcxPurarfkXJFNhbfYObvyy0RetX9ZFGG3Wbzrj2ubnPg48zjo34vzhaf6YDZzktXk5qBC1GGkcAmRFr7StOTuhh3Q8iL_5l5g5y1zHEXJngQ86DywLJaP2iHNaRvdfZ6X3eHSFkm8pYP0_gXnm0z5FlsFUy4BBVaaCC1_A9Pwqoo36kbG2Ws5liD5UMSEIKiNY4HojsjIa2Q","token_type":"bearer","refresh_token":"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJyZWFkZXIiLCJzY29wZSI6WyJkZW1vIl0sImF0aSI6IjhjN2NjOGU3LWExZGItNDBjMi05NDNiLTJjZTFhYzhhNDE1ZSIsImV4cCI6MTUwNzI4OTc3MCwiYXV0aG9yaXRpZXMiOlsiUkVBRCJdLCJqdGkiOiI5NjE1M2ZhNi1hNzBiLTRmZjUtODY2YS01YmUzZjE0MGMwMTIiLCJjbGllbnRfaWQiOiJ3ZWJfYXBwIn0.H3_kXyzZWutFfv14fWs5lKIedNIa-Tbl1C6OqvX-NpCnmFA6nK98cFnG7yn3-rEJh4NERp6q-JlnESMU633KmYEehfpYdYSff7AHRVfej-tlAhoWauN1-xBMRDtlzGOXqe7dmv8IjMy2xMn-nxvyT0CakwE1hCSnD96CfawdOPnaW_EaWo5WUwuVjBKlYutBRkx_Ouk82LzP7jC5NZJ5xgxKdi-ULQwYB4AuVnCCRBrrkTlCWXW-XxNMqP045tCAKTaZ7uPjkZcPszaBXfCnorD4M6uvSrXAxEIY7l0CDQpt-bZcORB3OeS3s4j4BZQEqJTYNHJ8b6EfzVnh92pG0A",
     *      "expires_in":43199,
     *      "scope":"demo",
     *      "jti":"8c7cc8e7-a1db-40c2-943b-2ce1ac8a415e"
     *  }
     *
     */
}
