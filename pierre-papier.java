// Pierre - Papier - Ciseaux
const choix = ["pierre", "papier", "ciseaux"];
function choixOrdinateur() {
  const index = Math.floor(Math.random() * 3);
  return choix[index];
}
function determinerGagnant(joueur, ordinateur) {
  if (joueur === ordinateur) {
    return "Égalité !";
  }

  if (
    (joueur === "pierre" && ordinateur === "ciseaux") ||
    (joueur === "papier" && ordinateur === "pierre") ||
    (joueur === "ciseaux" && ordinateur === "papier")
  ) {
    return "Tu gagnes !";
  } else {
    return "L'ordinateur gagne !";
  }
}

const joueur = prompt("Choisis : pierre, papier ou ciseaux").toLowerCase();
const ordinateur = choixOrdinateur();

console.log(`Tu as choisi : ${joueur}`);
console.log(`L'ordinateur a choisi : ${ordinateur}`);
console.log(determinerGagnant(joueur, ordinateur));
