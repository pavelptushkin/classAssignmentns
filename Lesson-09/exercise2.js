$(document).ready(function() {

    $("#submit").on('click', function() {
  
      const name = $("#name");
      const email = $("#email");
      const message = $("#message");
      const phone = $("#phone");
  
      const user = [name, email, phone];
  
      while (i < user.length) {
        if (user[i].val() == "") {
          $(message).text("Please Fill Out Required Fields").addClass(
            'warning');
          user[i].prev().addClass('warning');
        } else {
          user[i].prev().removeClass('warning');
        }
        i++;
      }
  
      if (!$("#form label").hasClass('warning')) {
        $("#form")[0].remove();
        $("#pre-form h2").text("Thanks for your feedback!")
      }
  
    });
  });