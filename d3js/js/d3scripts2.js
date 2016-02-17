var canvas = d3.select("#shapes3")
               .append("svg")
               .attr("width", 500)
               .("height",500);


var circle = canvas.append("circle").attr("cx", 50).attr("cy", 50).attr("r", 25);