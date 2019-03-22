import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("anoter_id", "6543");

        cookie1.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(1244);
        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }
}