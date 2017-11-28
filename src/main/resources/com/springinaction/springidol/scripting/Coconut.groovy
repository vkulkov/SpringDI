import com.springinaction.springidol.scripting.Lime
import com.springinaction.springidol.scripting.ICoconut

class Coconut implements ICoconut {
    private Lime lime

    void setLime(Lime lime) {
        this.lime = lime
    }

    @Override
    void drinkThemBothUp() {
        System.out.println("You put the lime in the coconut...")
        System.out.println("and drink 'em both up...")
        System.out.println("You put the lime in the coconut...")
        lime.drink()
    }
}