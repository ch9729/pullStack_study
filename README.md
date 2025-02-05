## 1일차
- 전통적인 Spring MVC의 컨트롤러인 @Controller는 주로 View를 반환하기 위해 사용
- Spring MVC Container는 Client의 요청으로부터 View를 반환
- 하지만 Spring MVC의 컨트롤러를 사용하면서 Data를 반환해야 하는 경우도 있다.
- 컨트롤러에서는 데이터를 반환하기 위해 @ResponseBody 어노테이션을 활용해주어야 한다.
- 이를 통해 Controller도 Json 형태로 데이터를 반환

### RestController
- @Controller에 @ResponseBody가 추가된 것
- 주 용도는 Json 형태로 객체 데이터를 반환하는 것

###  Security
- spring Security 두가지 인증 방식
  - formLogin 인증방식 : 서버에 해당 사용자의 session 상태가 유효한지를 판단해서 처리하는 인증 방식
  - HttpBasic 인증방식 : Http 프로토콜에서 정의한 기본 인증 방식, 사용자는 아이디와 패스워드를 인코딩한 문자열을 Authorization 헤더에 담아서 요청, HTTP는 기본적으로 무상태를 유지하는데 이는 서버가 클라이언트의 상태를 보존하지 않는다는 뜻
   
    ```javascript
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig {

    @Bean   //Configuration 필수
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(((requests) ->
                requests
                        .requestMatchers("/contact").permitAll()
                        .requestMatchers("/public/**").permitAll()
                .anyRequest().authenticated()));
        //http.formLogin(withDefaults());
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.httpBasic(withDefaults());
        return http.build();
    }
}
    ```

## 2일차