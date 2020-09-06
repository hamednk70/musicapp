<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://www.w3schools.com/lib/w3.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</head>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script src="https://www.w3schools.com/lib/w3.js"></script>
<body>
<button onclick="gfg_Run()" id="btn1">ok</button><br>
<button id="dd">test</button>

<h1 id="id02">
    {{fullname}} {{id}}
</h1>
<div id="tt"></div>
<div w3-include-html="/singer"></div>
<h2 id="test1">
    {{fullname}} {id} ${id}
</h2>
<table id="id01">
    <tr>
        <th>Customer</th>
        <th>City</th>
        <th>Country</th>
    </tr>
    <tr w3-repeat="/singer">
        <td>{{fullname}}</td>
        <td>{{City}}</td>
        <td>{{Country}}</td>
    </tr>
</table>

<script>
    w3.includeHTML(myCallback);

    function myCallback() {
        var myObject= {"customers":$("div")};
        w3.displayObject("id01", myObject);
    }
</script>
<%--<script>--%>
<%--    w3.getHttpObject("/singer", myFunction);--%>

<%--    function myFunction(myObject) {--%>
<%--        w3.displayObject("id01", myObject);--%>
<%--    }--%>
<%--</script>--%>
<%--<script>--%>
<%--    var myObject= {"customers":[{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]},{"id":2,"fullname":"sfd","nikename":"sfd","age":"12","alboms":[]}]};--%>
<%--    $("#btn1").click(function () {--%>
<%--        var myObject2= {"customers":[{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]},{"id":2,"fullname":"sfd","nikename":"sfd","age":"12","alboms":[]}]};--%>

<%--        // alert("{"+"\""+"customers"+"\""+":" + $("div").text()+"}");--%>
<%--        alert(m);--%>
<%--        // alert(myObject2.valueOf(1)));--%>
<%--    });--%>
<%--    w3.displayObject("id01", myObject);--%>
<%--</script>--%>


<%--<script>--%>
<%--    w3.includeHTML(myCallback);--%>
<%--    function myCallback() {--%>
<%--        var tt = $("div").textContent;--%>
<%--        var myObject1= "{"+"\""+"customers"+"\""+":"+tt+"}";--%>
<%--        $("#btn1").click(function () {--%>
<%--            // alert("{"+"\""+"customers"+"\""+":" + $("div").text()+"}");--%>
<%--            alert(myObject1);--%>
<%--        });--%>
<%--        w3.displayObject("id02", myObject1);--%>
<%--    }--%>


<%--</script>--%>

<%--<script>--%>


<%--    $(document).ready(function () {--%>
<%--        // var myObject= {"customers":[{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]},{"id":2,"fullname":"sfd","nikename":"sfd","age":"12","alboms":[]}]};--%>
<%--        $("#btn1").click(function () {--%>
<%--            alert("test");--%>

<%--            alert($("div").val());--%>
<%--            var tt= {"customers":[{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]},{"id":2,"fullname":"sfd","nikename":"sfd","age":"12","alboms":[]}]};--%>
<%--&lt;%&ndash;            alert("{"+"\""+"customers"+"\""+":" + $("div").text()+"}");&ndash;%&gt;--%>

<%--            &lt;%&ndash;var mm = ${cu};&ndash;%&gt;--%>
<%--            alert(tt);--%>
<%--            &lt;%&ndash;alert(mm);&ndash;%&gt;--%>


<%--        });--%>

<%--    });--%>


<%--</script>--%>


<%--<script>--%>
<%--    w3.includeHTML(myCallback);--%>
<%--    var myObject= {"customers": + $("div").text() };--%>
<%--    w3.displayObject("id01", myObject);--%>
<%--</script>--%>
<script>
    var myObject = [{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]}];
    w3.displayObject("id02", myObject);
</script>

<script>
    // var person = [{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]}];
    //
    // var myArray = Object.values(person);
    // document.getElementById("tt").innerHTML = myArray[0];
    var fruits = [{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]}];
    document.getElementById("tt").innerHTML = fruits.toString();

</script>


</body>
</html>
