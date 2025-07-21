package org.opstree

class Utility implements Serializable {
    def steps

    Utility(steps) {
        this.steps = steps
    }

    def printMessage(String msg) {
        steps.echo "Utility says: ${msg}"
    }
}
