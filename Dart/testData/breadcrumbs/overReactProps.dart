ComponentA getComponent() {
  return (A()..property = "abc")(
    B()(),
    C()(
      D()(),
      (E()..property = "xyz")(
        <caret>
      ),
    ),
  );
}