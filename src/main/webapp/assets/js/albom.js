$('document').ready(function () {
    $('table #editButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (albom, status) {
            $('#idEdit').val(albom.id);
            $('#titleEdit').val(albom.title);
            $('#priceEdit').val(albom.price);
            $('#singerEdit').val(albom.singer.id);
            $('#styleEdit').val(albom.style.id);
            $('#EditalbomImage').val(albom.albomImage);
            var albomDate = albom.date.substr(0,10);
            $('#dateEdit').val(albomDate);


        });

        $('#editModal').modal();
    });

    $('table #deleteButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal();
    });

    $('table #imageButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $('#albomPhoto').attr('src', href);

        $('#photoModal').modal();
    });
});