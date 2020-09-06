$('document').ready(function () {
    $('table #editButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href,function (vote, status) {
            $('#idEdit').val(vote.id);
            $('#nameEdit').val(vote.name);
            $('#familyEdit').val(vote.family);
            $('#passwordEdit').val(vote.password);
            $('#emailEdit').val(vote.email);
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