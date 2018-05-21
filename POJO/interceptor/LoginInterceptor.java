package interceptor;

import com.po.Customer;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
 
        String url = httpServletRequest.getRequestURI();
 
        if (url.indexOf("/login")>=0){
            return true;
        }
  
        HttpSession session = httpServletRequest.getSession();
        Customer user = (Customer)session.getAttribute("USER_SESSION");
     
        if (user!=null){
            return true;
        }
   
        httpServletRequest.setAttribute("msg","用户名或密码错误，请重新登录!");
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
