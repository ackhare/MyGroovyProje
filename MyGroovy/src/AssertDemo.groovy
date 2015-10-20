name='chetan'
// name non-null and non-empty according to Groovy Truth
  assert name
  // safe navigation + Groovy Truth to check
  assert name?.size() > 3
