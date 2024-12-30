function comparo() {
    var drop1 = document.getElementById("compare1").value;
    var drop2 = document.getElementById("compare2").value;

    if (drop1 === "--select here--" && drop2 === "--select here--") {
        document.write("Please select the option from the dropdown")
    }
    else {
        document.write("Selected: " + drop1 + " and " + drop2);
    }
}   