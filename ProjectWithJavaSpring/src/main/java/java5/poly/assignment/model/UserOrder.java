package java5.poly.assignment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")
public class UserOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    private Account account;

    @Column(name = "userOrder")
    @NotBlank
    private String nguoiDat;

    @Column(name = "UserReceive")
    @NotBlank
    private String nguoiNhan;

    @Column(name = "UserNumber")
    @NotBlank
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "CreateDate")
    private LocalDate ngayTao;

    @Column(name = "Address")
    @NotBlank
    private String diaChi;

    @Column(name = "status")
    private Integer trangThai;
}
