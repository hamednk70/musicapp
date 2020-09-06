$('document').ready(function () {
    $('table #editButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (singer, status) {
            $('#idEdit').val(singer.id);
            $('#fullnameEdit').val(singer.fullname);
            $('#nikenameEdit').val(singer.nikename);
            $('#ageEdit').val(singer.age);

        });

        $('#editModal').modal();
    });

    $('table #deleteButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal();
    });
});