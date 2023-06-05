function loadCities() {
    var transportType = $("#transportType").val();
    $.ajax({
        url: "/request/" + transportType,
        type: "GET",
        success: function (data) {
            var citySelect = $("#citySelectOt");
            citySelect.empty();

            $.each(data, function (index, city) {
                citySelect.append($("<option></option>").attr("value", city).text(city));
            });
        }
    });
}