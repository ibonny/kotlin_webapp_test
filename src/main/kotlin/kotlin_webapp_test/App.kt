package kotlin_webapp_test

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpServlet
import javax.servlet.annotation.WebServlet

import com.beust.klaxon.Klaxon

data class Testout(val firstName: String, val lastName: String)

@WebServlet(name = "Hello", value = ["/"])
class HomeController : HttpServlet() {
    override fun doGet(req: HttpServletRequest, res: HttpServletResponse) {
        val str = Klaxon().toJsonString(Testout("Ian", "Bonnycastle"))

        res.writer.write(str)
    }
}
