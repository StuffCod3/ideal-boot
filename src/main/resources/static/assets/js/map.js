let center = [55.415477,37.888837];

function init() {
	let map = new ymaps.Map('map-test', {
		center: center,
		zoom: 14
	});

	var myPlacemark = new ymaps.GeoObject({
        geometry: {
            type: "Point",
            coordinates: [55.415477,37.888837]
        }
    });

    map.controls.remove('geolocationControl'); // удаляем геолокацию
    map.controls.remove('searchControl'); // удаляем поиск
    map.controls.remove('trafficControl'); // удаляем контроль трафика
    map.controls.remove('typeSelector'); // удаляем тип

      // map.controls.remove('fullscreenControl'); // удаляем кнопку перехода в полноэкранный режим
      // map.controls.remove('zoomControl'); // удаляем контрол зуммирования
    map.controls.remove('rulerControl'); // удаляем контрол правил
    map.geoObjects.add(myPlacemark);
}



ymaps.ready(init);