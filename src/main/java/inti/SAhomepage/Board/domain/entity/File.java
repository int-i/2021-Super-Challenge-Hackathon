package inti.SAhomepage.Board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File {

    @Id
    @GeneratedValue
    private Long fid;

    @Column(nullable = false)
    private String origFilename;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String filePath;

    @Builder
    public File(Long fid, String origFilename, String filename, String filePath){
        this.fid = fid;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}
