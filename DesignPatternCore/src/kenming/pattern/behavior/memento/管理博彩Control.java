package kenming.pattern.behavior.memento;

import kenming.pattern.behavior.memento.dto.*;

/// <summary>
/// The 'Client' class
/// </summary>
public class 管理博彩Control
{
    private 複合彩 originator;             // 需要儲存狀態的來源物件
    private 複合彩Caretaker caretaker;     // 復原機制

    // Constructor
    public 管理博彩Control()
    {
        originator = new 複合彩();
        caretaker = new 複合彩Caretaker();
    }

    // 由 ogiginator 負責執行自動選號的功能
    public int 選號()
    {            
        return originator.選號();
    }

    // 將組合彩券的狀態儲存起來
    public void Save選號(複合彩DTO dto)
    {
        originator.set字彩(dto.成語字謎);
        originator.set彩券號碼(dto.彩券號碼);

        caretaker.SaveState(this.originator);            
    }

    // 透過復原機制回復組合彩券的狀態
    public 複合彩DTO 還原選號()
    {
        複合彩DTO dto = new 複合彩DTO();

        caretaker.RestoreState(this.originator);
        dto.彩券號碼 = originator.get彩券號碼();
        dto.成語字謎 = originator.get字彩();

        return dto;
    }
}
