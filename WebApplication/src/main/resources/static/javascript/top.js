/**
 *
 */

function userlist_click(click_obj) {
  var userid = $(click_obj).children("#userid").text();

  document.getElementById("clickuser").value = userid;
  document.getElementById("form").submit();
}
