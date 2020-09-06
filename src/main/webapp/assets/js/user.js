$('document').ready(function () {
    $('table #editButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (user, status) {
            $('#idEdit').val(user.id);
            $('#nameEdit').val(user.name);
            $('#familyEdit').val(user.family);
            $('#passwordEdit').val(user.password);
            $('#emailEdit').val(user.email);
            $('#managerEdit').val(user.manager);

            // $('#dateEdit').val(albom.date);


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