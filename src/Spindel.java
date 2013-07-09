public class Spindel {
	value nenndurchmesser;
	value steigung;
	value gewindereibzahl;
	value kopfreibzahl;
	value flankenwinkel;
	value mitlererDurchmesserStirnauflageflaeche;

	public Spindel(value nenndurchmesser, value steigung,
			value gewindereibzahl, value kopfreibzahl, value flankenwinkel,
			value mitlererDurchmesserStirnauflageflaeche) {
		this.nenndurchmesser = nenndurchmesser;
		this.steigung = steigung;
		this.gewindereibzahl = gewindereibzahl;
		this.kopfreibzahl = kopfreibzahl;
		this.flankenwinkel = flankenwinkel;
		this.mitlererDurchmesserStirnauflageflaeche = mitlererDurchmesserStirnauflageflaeche;
	}

	public value getNenndurchmesser() {
		return nenndurchmesser;
	}

	public void setNenndurchmesser(value nenndurchmesser) {
		this.nenndurchmesser = nenndurchmesser;
	}

	public value getSteigung() {
		return steigung;
	}

	public void setSteigung(value steigung) {
		this.steigung = steigung;
	}

	public value getGewindereibzahl() {
		return gewindereibzahl;
	}

	public void setGewindereibzahl(value gewindereibzahl) {
		this.gewindereibzahl = gewindereibzahl;
	}

	public value getKopfreibzahl() {
		return kopfreibzahl;
	}

	public void setKopfreibzahl(value kopfreibzahl) {
		this.kopfreibzahl = kopfreibzahl;
	}

	public value getFlankenwinkel() {
		return flankenwinkel;
	}

	public void setFlankenwinkel(value flankenwinkel) {
		this.flankenwinkel = flankenwinkel;
	}

	public value getMitlererDurchmesserStirnauflageflaeche() {
		return mitlererDurchmesserStirnauflageflaeche;
	}

	public void setMitlererDurchmesserStirnauflageflaeche(
			value mitlererDurchmesserStirnauflageflaeche) {
		this.mitlererDurchmesserStirnauflageflaeche = mitlererDurchmesserStirnauflageflaeche;
	}

}
