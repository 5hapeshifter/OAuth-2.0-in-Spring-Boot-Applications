## Fluxo de autenticação e verificação
O usuario (resource owner) faz uma requisição, uma requisição é gerada automaticamente para o authorization server verificar as 
informações de acesso, se estiverem "ok", é gerado é devolvido o token de acesso, esse token é anexado a resição do 
cliente e enviado para o resource server (server onde os dados do usuário ficam armazenados), após o
resource server receber a requisição, ele vai validar se o token é válido no authorization server, se estiver "ok", a 
requisição será processada normalmente, senão deverá ser retornado alguma informação do bloqueio do acesso.

### URL para pegar o authorization code
Temos que fazer o login na URL abaixo do keycloak e o token sera gerado na URL
http://localhost:8080/realms/Appsdeveloperblog/protocol/openid-connect/auth?client_id=photo-app-code-flow-client&response_type=code&scope=openid profile&redirect_uri=http://localhost:8083/callback&state=sfafasfasfas
### URL para pegar o token
Devemos usar o authorization code no header(code) para conseguir o token Jwt
http://localhost:8080/realms/Appsdeveloperblog/protocol/openid-connect/token

### Scopes
Scopes é um mecanismo no Oauth 2.0 para limitar o acesso da aplicação a conta do usuário.
Uma API pode solicitar o acesso a um ou mais Scopes, essa informação sera aprensentada na tela de aceite,
e o token apresentado e gerado dará o acesso limitado a esses Scopes.