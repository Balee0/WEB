// event pada saat link di click
$('.page-scroll').on('click', function(e){

    // ambil isi href
    var href = $(this).attr('href');
    // takngkap element
    var elementTujuan = $(href);

    // pindahkan scroll
    $('html, body').animate({
        scrollTop: elementTujuan.offset().top - 50
    }, 1250, 'swing');

    e.preventDefault();

});