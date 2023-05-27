document.querySelector('calc_href').addEventListener('click', function(event) {
    event.preventDefault(); // Предотвращаем переход по ссылке, чтобы не обновлять страницу
    
    var div = document.querySelector(this.getAttribute('calculate')); // Находим нужный div
    var rect = div.getBoundingClientRect(); // Получаем его координаты и размеры
    
    window.scrollTo({
    top: rect.top + window.pageYOffset, // Прокручиваем страницу к координатам div
    behavior: 'smooth' // Добавляем плавный эффект прокрутки
    });
});