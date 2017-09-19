<!doctype html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title></title>
        <!-- stylesheets -->
        <link rel="stylesheet" href="lib/Treant.css" type="text/css"/>
        <link rel="stylesheet" href="lib/perfect-scrollbar/perfect-scrollbar.css" type="text/css"/>
    </head>
    <body>
        <div id="tree-simple" style="width:335px; height: 160px"> </div>

        <script src="lib/raphael.js"></script>
        <script src="lib/Treant.js"></script>
        <script src="lib/jquery.min.js"></script>
        <script src="lib/jquery.mousewheel.js"></script>
        <script src="lib/jquery.easing.js"></script>
        <script src="lib/perfect-scrollbar/perfect-scrollbar.js"></script>
        <script>
            var simple_chart_config = ${chart};
            var my_chart = new Treant(simple_chart_config);
        </script>
    </body>
</html>