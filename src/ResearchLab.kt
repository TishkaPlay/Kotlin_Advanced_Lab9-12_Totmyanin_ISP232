class EnergyGenerator : OutpostModule("Генератор энергии") {
    override fun perfomAction(manager: ResourceManager) {
        println("Генератор работает... Производит 20 энергии")
        val energy = manager.get("Energy")
        if (energy != null) {
            energy.amount += 20
        } else {
            manager.add(OutpostResource(99, "Enegry", 20))
        }
    }
}

class ResearchLab : OutpostModule("Исследовательская лаборатория"
) {
    override fun perfomAction(manager: ResourceManager) {
        val minerals = manager.get("Minerals")

        if (minerals == null || minerals.amount < 30) {
            println("Недостаточно минералов для исследования")
            return
        }
        minerals.amount -=30
        println("Лаборатория проводит исследование (минералы -30)")
    }
}