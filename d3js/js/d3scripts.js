d3.select("#shapes")
    .style("color", "blue")
    .text("Hello World!");


var dataArray =  [20, 30, 50, 80, 70];

var width = 500;
var height = 500;

var canvas = d3.select("#shapes2").append("svg").attr("width",width).attr("height",height).append("g").attr("transform", "translate(30,10)");

//.append("g") is to append a group element

var widthScale = d3.scale.linear().domain([0, 80]).range([0,500]);

var colorScale = d3.scale.linear().domain([0,80]).range(["blue","red"]);

//change number of ticks and use .axis() to implement axis 

var axis = d3.svg.axis().ticks(4).scale(widthScale);


/*var canvas2 = canvas.append("circle").attr("cx", 250).attr("cy",250).attr("r", 50).attr("fill", "red");

var canvas3 = canvas.append("rect").attr("width", 100).attr("height", 50);

var line = canvas.append("line").attr("x1",0).attr("y1", 100).attr("x2",400).attr("y2",400).attr("stroke", "green").attr("stroke-width", 10); 

code to get a circle, a rectangle and a line
*/

/*barchart */

var bar = canvas.selectAll("rect")
                .data(dataArray)
                .enter()
                .append("rect")
                .attr("width", function(d){ return widthScale(d); })
                .attr("height", 50)
                .attr("fill", function(d){ return colorScale(d);})
                .attr("y",function(d, i){return i*100});


//change the location of the axis 
canvas.append("g").attr("transform","translate(0, 460)").call(axis);

