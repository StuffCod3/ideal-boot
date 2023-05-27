let center = [55.41616868016099,37.89380057287891];

function init() {
	let map = new ymaps.Map('map-test', {
		center: center,
		zoom: 14
	});
}

ymaps.ready(init);