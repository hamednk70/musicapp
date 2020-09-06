$('document').ready(function () {
    $('table #editButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (style, status) {
            $('#idEdit').val(style.id);
            $('#titleEdit').val(style.title);
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