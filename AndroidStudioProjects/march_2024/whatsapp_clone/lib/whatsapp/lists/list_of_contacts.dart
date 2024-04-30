class ListOfContacts {

  late String firstname, surname, image, message;
  ListOfContacts(this.firstname, this.surname, this.image, this.message);

  /// Named constructor
  ListOfContacts.withMessage(
      this.firstname, this.surname, this.image, this.message,
  );
}
