public interface UsbTypeC {
    void readData();
}

class OldLegacySdCard {
    public void readFromSdCard() { System.out.println("Чтение старой SD-карты."); }
}

class CardReaderAdapter implements UsbTypeC {
    private final OldLegacySdCard sdCard;
    public CardReaderAdapter(OldLegacySdCard sdCard) { this.sdCard = sdCard; }
    @Override
    public void readData() { sdCard.readFromSdCard(); }
}
