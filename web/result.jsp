<%@ page import="java.util.*" %>
    <html>

    <body>
        <h1 align="center">
            Beer Recomendations JSP
        </h1>
        <p>
            <%
                List styles = (List)request.getAttribute("styles");
                Iterator it = styles.iterator();
                while(it.hasNext()){
                    out.print("<br>try:"+it.next());
                }
                out.print("<br>"+getServletContext().getInitParameter("adminEmail"));
            %>
        </p>
        person is
        <%-- <% foo.Person p = (foo.Person)request.getAttribute("person"); %>
            <%= p.getName()%>
                --%>
                <jsp:useBean id="person" class="foo.Person" scope="request">
                    <jsp:setProperty name="person" property="name" value="Fred" />
                </jsp:useBean>
                <%-- <jsp:setProperty name="person" property="name" value="Fred" /> --%>
                    <jsp:getProperty name="person" property="name" />

    </body>

    </html>