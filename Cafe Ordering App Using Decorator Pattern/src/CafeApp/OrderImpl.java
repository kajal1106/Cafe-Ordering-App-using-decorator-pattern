package CafeApp;

public abstract class OrderImpl implements OrderInterface {
	OrderInterface orderObj;
}
class Americano extends OrderImpl{
	 public Americano(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.65);
	}
}

class Cappuccino extends OrderImpl{
	 public Cappuccino(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.10);
	}
}

class Latte extends OrderImpl{
	 public Latte(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.34);
	}
}

class Mocha extends OrderImpl{
	 public Mocha(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.10);
	}
}

class FlatWhite extends OrderImpl{
	 public FlatWhite(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.45);
	}
}

class HotChocolate extends OrderImpl{
	 public HotChocolate(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.15);
	}
}

class StrawberryGreenTea extends OrderImpl{
	 public StrawberryGreenTea(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.65);
	}
}

class MintGreenTea extends OrderImpl{
	 public MintGreenTea(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.95);
	}
}

class MasalaChaiLatte extends OrderImpl{
	 public MasalaChaiLatte(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.65);
	}
}

class HolyBasilChai extends OrderImpl{
	 public HolyBasilChai(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class CookieCrumble extends OrderImpl{
	 public CookieCrumble(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.65);
	}
}
class Frappuccino extends OrderImpl{
	 public Frappuccino(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 5.65);
	}
}
class Lemonicetea extends OrderImpl{
	 public Lemonicetea(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 5.25);
	}
}
class BerryLemonade extends OrderImpl{
	 public BerryLemonade(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 5.95);
	}
}
class GreenAppleTea extends OrderImpl{
	 public GreenAppleTea(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class Veganspresso extends OrderImpl{
	 public Veganspresso(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 6.65);
	}
}
class EspressoShake extends OrderImpl{
	 public EspressoShake(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 6.65);
	}
}
class ChocolateTruffle extends OrderImpl{
	 public ChocolateTruffle(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 8.65);
	}
}
class Cheescake extends OrderImpl{
	 public Cheescake(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 9.65);
	}
}
class ChocochipMuffin extends OrderImpl{
	 public ChocochipMuffin(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.65);
	}
}
class ChocoMarble extends OrderImpl{
	 public ChocoMarble(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class ChocolateCookie extends OrderImpl{
	 public ChocolateCookie(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.65);
	}
}
class DoubleChocolateCookie extends OrderImpl{
	 public DoubleChocolateCookie(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.65);
	}
}
class Brownie extends OrderImpl{
	 public Brownie(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class DeathByChocolate extends OrderImpl{
	 public DeathByChocolate(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 10.65);
	}
}
class MintyMidnight extends OrderImpl{
	 public MintyMidnight(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 9.65);
	}
}
class Tiramisu extends OrderImpl{
	 public Tiramisu(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 12.65);
	}
}
class RedVelvateCake extends OrderImpl{
	 public RedVelvateCake(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 8.65);
	}
}
class Fries extends OrderImpl{
	 public Fries(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class MasalaWedges extends OrderImpl{
	 public MasalaWedges(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 6.65);
	}
}
class VegPuff extends OrderImpl{
	 public VegPuff(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class BasilCheese extends OrderImpl{
	 public BasilCheese(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 15.65);
	}
}
class Nuggets extends OrderImpl{
	 public Nuggets(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 9.25);
	}
}
class PeriperiFries extends OrderImpl{
	 public PeriperiFries(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.50);
	}
}
class Bruschetta extends OrderImpl{
	 public Bruschetta(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 20.65);
	}
}
class BasilCheeseBagel extends OrderImpl{
	 public BasilCheeseBagel(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 18.65);
	}
}
class GarlicBread extends OrderImpl{
	 public GarlicBread(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class ChilliCheeseToast extends OrderImpl{
	 public ChilliCheeseToast(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.65);
	}
}
class Samosa extends OrderImpl{
	 public Samosa(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class Small extends OrderImpl{
	 public Small(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 0);
	}
}
class Regular extends OrderImpl{
	 public Regular(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.65);
	}
}
class Grande extends OrderImpl{
	 public Grande(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 4.65);
	}
}
class Cream extends OrderImpl{
	 public Cream(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 2.20);
	}
}
class Hazelnut extends OrderImpl{
	 public Hazelnut(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 1.65);
	}
}
class Peppermint extends OrderImpl{
	 public Peppermint(OrderInterface orderObj) {
		// TODO Auto-generated constructor stub
		 this.orderObj=orderObj;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "Item added for the checkout";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (orderObj.cost() + 3.65);
	}
}
